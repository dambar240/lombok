package com.github.dambar240.lombok.services

import com.intellij.openapi.project.Project
import com.github.dambar240.lombok.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
