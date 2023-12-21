
package com.example.demoapplication

import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Singleton

class Food constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

class SharedFood constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

class Spoon constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

interface Item {
    fun showInstance(): String
}
