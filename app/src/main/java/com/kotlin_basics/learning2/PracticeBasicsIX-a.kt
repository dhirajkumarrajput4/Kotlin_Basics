package com.kotlin_basics.learning2


//Delegation
fun main() {
    val tasName = "Downloading file"
    val bgTask = BgTask(tasName)
    val bgExecutor = BgExecutorTask(tasName)
    val taskManager = TaskManager(bgTask, bgExecutor)
    taskManager.create()
    taskManager.execute()
}


class BgTask(val taskName: String) : Task {
    override fun create() {
        println("Task $taskName Created !")
    }
}

class BgExecutorTask(val executorName: String) : ExecutorTask {
    override fun execute() {
        println("Task $executorName Executed !")
    }

}

interface Task {
    fun create()
}

interface ExecutorTask {
    fun execute()
}


/*
class TaskManager(val creator: Task, val excutor: ExecutorTask) : Task, ExecutorTask {
    override fun create() {
        creator.create()
    }

    override fun execute() {
        excutor.execute()
    }

}*/

// above and code also do the same thing
// here we are achieving delegation thru 'by' keyword
class TaskManager(val creator: Task, val excutor: ExecutorTask) : Task by creator, ExecutorTask by excutor