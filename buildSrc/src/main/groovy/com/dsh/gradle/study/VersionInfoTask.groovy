package com.dsh.gradle.study

import groovy.xml.MarkupBuilder
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * 自定义Task，实现维护版本信息功能
 */
class VersionInfoTask extends DefaultTask{

    VersionInfoTask(){
        group = 'dsh'
        description = 'update the release infoo'
    }

    /**
     * 执行于gradle执行阶段的代码
     * @return
     */
    @TaskAction
    void doAction(){
        updateInfo()
    }

    //真正的将Extension类中的信息写入指定文件中
    private void updateInfo(){
        //获取将要写入的信息
        String versionCodeMsg = project.extensions.dshJavaVersionInfo.versionCode
        String versionNameMsg = project.extensions.dshJavaVersionInfo.versionName
        String versionInfoMsg = project.extensions.dshJavaVersionInfo.versionInfo
        String fileName = project.extensions.dshJavaVersionInfo.fileName
        def file = project.file(fileName)
        //将实体对象转化为xml格式数据
        def sw = new StringWriter()
        def xmlBuilder = new MarkupBuilder(sw)
        if (file.text !=null &&file.text.size()<=0){
            //文件中没有内容
            xmlBuilder.release{
                release{
                    versionCode(versionCodeMsg)
                    versionName(versionNameMsg)
                    versionInfo(versionInfoMsg)
                }
            }
            file.withWriter {writer -> weiter.append(sw.toString())}
        }else{
            //已有版本信息
            xmlBuilder.release{
                versionCode(versionCodeMsg)
                versionName(versionNameMsg)
                versionInfo(versionInfoMsg)
            }
            //将生成的xml数据插入到根节点之前
            def lines = file.readLines()
            def lengths = lines.size()-1
            file.withWriter {writer ->
                lines.eachWithIndex{ String line, int index ->
                    if(index !=lengths){
                        writer.append(line +"\r\n")
                    }else if(index == lengths){
                        writer.append("\r\n"+sw.toString()+"\r\n")
                        writer.append(lines.get(lengths))
                    }
                }
            }
        }
    }

}