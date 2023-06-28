# Safe Spaces

# Creating Variables

data <- c("name", "age", "sexuality", "gender", "race", "ethnicity", "religion")

# Creating a List for Individual Attribute Data

attributes <- list()
attributes$name <- c("John", "James", "Jill")
attributes$age <- c(20, 21, 22)
attributes$sexuality <- c("Heterosexual", "Homosexual", "Bisexual")
attributes$gender <- c("Male", "Female", "Non-Binary")
attributes$race <- c("White", "Hispanic", "African American")
attributes$ethnicity <- c("French Canadian", "Italian", "Indian")
attributes$religion <- c("Christianity", "Islam", "Atheism")

# Creating a List of Safe Space Groups

safe_spaces <- list()
safe_spaces$LGBTQ <- list()
safe_spaces$LGBTQ$name <- c("Gay & Straight Alliance", "Pride Alliance", "Transgender Support Group")

safe_spaces$Race_and_Ethnicity <- list()
safe_spaces$Race_and_Ethnicity$name <- c("Black Student Union", "Asian Pacific Islanders Alliance", "Latinos United")

safe_spaces$Religion <-list()
safe_spaces$Religion$name <- c("Christian Fellowship", "Jewish Comunity", "Secular Humanists")

# Creating a Function to Create a Safe Space

create_safe_space <- function(group_name, attributes){

  # Assign the Group Name
  safe_spaces[[group_name]] <- list()
  safe_spaces[[group_name]][["name"]] <- group_name

  # Creating the Safe Space Specific Attributes
  for (attribute in attributes) {
    safe_spaces[[group_name]][[attribute]] <- c()
    message("Creating a safe space for: \n" )
    message(paste("\tThe attribute: ", attribute, "\n", sep=""))
    print(attributes[[attribute]])
    message("\n")
  }
}

# Creating Groups for Specific Needs

create_safe_space("Military Veterans", c("name", "age", "gender", "race", "ethnicity"))

# Creating a Function to Gather Group Members

gather_group_members <- function(group_name, attributes) {

  # Gather Group Member Information
  message(paste("Gathering group member information for: ", group_name, "\n"))
  for (attribute in attributes) {
    message(paste("Gathering ", attribute, " data: \n"))
    safe_spaces[[group_name]][[attribute]] <- scan(what = "character", nmax=nrow(attributes[[attribute]]))
  }

  # Display Group Member Information
  message(paste("\nGroup Member Information for: ", group_name, "\n"))
  for (attribute in attributes) {
    message(paste("\n", attribute, " data: \n"))
    print(safe_spaces[[group_name]][[attribute]])
  }
}

# Gathering Group Member Information

gather_group_members("Military Veterans", c("name", "age", "gender", "race", "ethnicity"))