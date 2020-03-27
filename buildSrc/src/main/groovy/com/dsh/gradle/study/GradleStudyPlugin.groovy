package com.dsh.gradle.study
import org.gradle.api.Plugin
import org.gradle.api.Project

class GradleStudyPlugin implements Plugin<Project>{

    /**
     * 插件被引入时要执行的方法
     * @param target The target object 引入当前插件的project
     */
    @Override
    void apply(Project project) {
//        println 'hello Plugin ...'+project.name
        project.extensions.create('dshJavaVersionInfo',VersionInfoExtension)

    }
}