package com.github.rosewood38.myfirsttemplate.services

import com.intellij.openapi.project.Project
import com.github.rosewood38.myfirsttemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
