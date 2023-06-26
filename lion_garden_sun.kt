object SafeSpaces { 
    fun createSafeSpace(name: String?): Boolean { 
        if (name != null) { 
            println("Safe space called $name successfully created!") 
            return true 
        } 
        return false 
    } 
 
    fun joinSafeSpace(safeSpaceName: String): String { 
        return "Welcome to $safeSpaceName!" 
    } 
 
    fun addSafeSpaceRule(rule: String): Unit { 
        println("Adding rule: $rule") 
    } 
 
    fun deleteSafeSpaceRule(rule: String): Unit { 
        println("Deleting rule: $rule") 
    } 
 
    fun listSafeSpaceRules(): String { 
        val rules: List<String> = listOf("No dancing allowed", "No loud music in the lobby",
                "No eating food inside the safe space", "No judgement or discrimination of any kind") 
        var rulesList = "" 
     
        for (rule in rules) { 
            rulesList += "\n- $rule" 
        } 
        return rulesList 
    } 
 
    fun listSafeSpaceMembers(): List<String> { 
        return listOf("Max", "Anna", "Nikki", "Stephanie", "John") 
    } 
 
    fun welcomeNewMember(name: String): String { 
        return "Welcome to the safe space, $name!" 
    } 
 
    fun sendInvite(person: String): String { 
        return "Hey, $person! You've been invited to join our safe space!" 
    } 
 
    fun removeMember(name: String): String { 
        return "$name has been removed from the safe space." 
    } 
 
    fun reportHarassment(name: String): String { 
        return "$name has been reported for harassment in the safe space." 
    } 
 
    fun banUser(name: String): String { 
        return "$name has been banned from the safe space." 
    } 
 
    fun closeSafeSpace(): Boolean { 
        println("Safe space succesfully closed!") 
        return true 
    } 
}