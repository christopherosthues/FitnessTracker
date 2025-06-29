package org.darthacheron.fitness.dependencies

interface MyRepository {
    fun helloWorld(): String
}

class MyRepositoryImp(private val dbClient: DbClient): MyRepository {
    override fun helloWorld(): String {
        return "Hello World!"
    }
}