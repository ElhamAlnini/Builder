class Employee private  constructor(builder:Builder) {
    var firstName:String
    var lastName:String
    var id:String
    var isManager:Boolean
    var managerId:String

    init {
        this.firstName=builder.firstName
        this.lastName=builder.lastName
        this.id=builder.id
        this.isManager= builder.isManager
        this.managerId=builder.managerId
    }
    class Builder {
        var firstName:String=""
        var lastName:String=""
        var id:String=""
        var isManager:Boolean=true
        var managerId:String=""
        fun build():Employee {
            return Employee(this);
        }
        fun setFirstName(firstName: String): Builder {
            this.firstName = firstName
            return this
        }

        fun setLastName(lastName: String): Builder {
            this.lastName = lastName
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsManager(manager: Boolean): Builder {
            this.isManager = manager
            return this
        }

        fun setManagerId(managerId: String): Builder {
            this.managerId = managerId
            return this
        }

    }
}

fun main() {
    val employee=Employee.Builder()
                               .setFirstName("Doug")
                               .setLastName("sigelbaum")
                               .setIsManager(false)
                               .setManagerId("XXX")
}