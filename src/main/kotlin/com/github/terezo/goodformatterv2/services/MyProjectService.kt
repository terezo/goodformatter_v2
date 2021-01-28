package com.github.terezo.goodformatterv2.services

import com.github.terezo.goodformatterv2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
