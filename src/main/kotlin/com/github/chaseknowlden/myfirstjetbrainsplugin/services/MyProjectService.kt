package com.github.chaseknowlden.myfirstjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.chaseknowlden.myfirstjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
