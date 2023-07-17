// Create the Safe Spaces library

// Create a constructor to create a new Safe Space
function SafeSpace(name, owner, description, users) {
  this.name = name;
  this.owner = owner;
  this.description = description;
  this.users = users;
}

// Create a new Safe Space
 let safeSpace = new SafeSpace('My Safe Space', 'Me', 'A safe and welcoming environment for everyone.', []);

// Add methods to the SafeSpace prototype
SafeSpace.prototype.addUser = function(user){
  this.users.push(user);
};

SafeSpace.prototype.removeUser = function(user) {
  let index = this.users.indexOf(user);
  if (index > -1) {
    this.users.splice(index,1);
  }
};

// Create a helper function to check if user is part of a SafeSpace
SafeSpace.prototype.isUserPresent = function(user){
  return this.users.includes(user);
};

// Create an array of SafeSpaces
let safeSpaces = [];

// Create a method to create a new SafeSpace
SafeSpace.prototype.createSafeSpace = function(name, owner, description){
  let newSafeSpace = new SafeSpace(name, owner, description, []);
  safeSpaces.push(newSafeSpace);
  return newSafeSpace;
};

// Create a method to delete a SafeSpace
SafeSpace.prototype.deleteSafeSpace = function(name){
  let index = safeSpaces.indexOf(name);
  if (index > -1) {
    safeSpaces.splice(index,1);
  }
};

// Create a helper function to check if a certain SafeSpace exists
SafeSpace.prototype.safeSpaceExists = function(name){
  let safeSpacesNames = safeSpaces.map(function(safeSpace){
    return safeSpace.name;
  });
  return safeSpacesNames.includes(name);
};

// Create a function to get a SafeSpace
SafeSpace.prototype.getSafeSpace = function(name){
  if(this.safeSpaceExists(name)){
    let index = safeSpaces.indexOf(name);
    return safeSpaces[index];
  }
};

// Create a method to add a user to a SafeSpace
SafeSpace.prototype.addUserToSafeSpace = function(name, user){
  if(this.safeSpaceExists(name)){
    let safeSpace = this.getSafeSpace(name);
    safeSpace.addUser(user);
  }
};

// Create a method to remove a user from a SafeSpace
SafeSpace.prototype.removeUserFromSafeSpace = function(name, user){
  if(this.safeSpaceExists(name)){
    let safeSpace = this.getSafeSpace(name);
    safeSpace.removeUser(user);
  }
};