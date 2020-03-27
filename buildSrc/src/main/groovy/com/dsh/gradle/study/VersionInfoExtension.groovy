package com.dsh.gradle.study
/**
 * 与自定义Plugin进行参数传递
 */
class VersionInfoExtension{

    String versionCode
    String versionInfo
    String versionName
    String fileName

    VersionInfoExtension(){

    }

    @Override
    String toString() {
        """|versionCode = ${versionCode}
            |versionInfo = ${versionInfo}
            |versionName = ${versionName}
            |fileName = ${fileName}
        """.stripMargin()
    }
}