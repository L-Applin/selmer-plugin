package com.github.lapplin.selmerplugin.services

import com.github.lapplin.selmerplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
