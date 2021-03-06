package com.github.odusanya18.droneci.orca.models.execution

data class DroneCIStageExecution (
        val master: String,
        val repo: String?,
        val buildNumber: Long?,
        val namespace: String?,
        val branch: String?,
        val commit: String?,
        val environment: Map<String, String>?
)