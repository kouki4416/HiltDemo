
package com.example.demoapplication

import javax.inject.Inject

class ActivitySharedItem @Inject constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }

}

class ActivityItem @Inject constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

class SingletonSharedItem @Inject constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

class SingletonItem @Inject constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

class ViewModelItem @Inject constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

class ViewModelSharedItem @Inject constructor() : Item {
    override fun showInstance(): String {
        return this.toString()
    }
}

interface Item {
    fun showInstance(): String
}
