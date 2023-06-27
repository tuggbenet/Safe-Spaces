// Create a class 'SafeSpace' that represents a protected, supportive, and welcoming environment
class SafeSpace {
    // Constructor function to create a SafeSapce object
    constructor() {
        this.members = [];
    }

    // Method to add a member to the SafeSpace
    addMember(member) {
        this.members.push(member);
    }

    // Method to check if a member is in the SafeSpace
    isMember(member) {
        return this.members.includes(member);
    }

    // Method to remove a member from the SafeSpace
    removeMember(member) {
        const idx = this.members.indexOf(member);
        if (idx === -1) {
            throw new Error(`${member} is not a member of this SafeSpace.`);
        }
        this.members.splice(idx, 1);
    }

    // Method to provide a list of all members of the SafeSpace
    listMembers() {
        return this.members;
    }

    // Method to check if the SafeSpace is empty
    isEmpty() {
        return this.members.length === 0;
    }

    // Method to provide a size of the SafeSpace
    size() {
        return this.members.length;
    }

}

// Create a class 'SafeSpaceManager' to manage multiple SafeSpaces
class SafeSpaceManager {
    // Constructor function to create a SafeSpaceManager object
    constructor() {
        this.spaces = {};
    }

    // Method to create a new SafeSpace
    createSpace(spaceName) {
        if (this.spaces[spaceName] !== undefined) {
            throw new Error(`SafeSpace ${spaceName} is already exists.`);
        }
        this.spaces[spaceName] = new SafeSpace();
    }

    // Method to remove an existing SafeSpace
    removeSpace(spaceName) {
        if (this.spaces[spaceName] === undefined) {
            throw new Error(`SafeSpace ${spaceName} does not exist.`);
        }
        delete this.spaces[spaceName];
    }

    // Method to check if a SafeSpace exists
    isSpace(spaceName) {
        return this.spaces[spaceName] !== undefined;
    }

    // Method to add a member to a SafeSpace
    addMember(spaceName, member) {
        if (this.spaces[spaceName] === undefined) {
            throw new Error(`SafeSpace ${spaceName} does not exist.`);
        }
        this.spaces[spaceName].addMember(member);
    }

    // Method to remove a member from a SafeSpace
    removeMember(spaceName, member) {
        if (this.spaces[spaceName] === undefined) {
            throw new Error(`SafeSpace ${spaceName} does not exist.`);
        }
        this.spaces[spaceName].removeMember(member);
    }

    // Method to check if a member is in a particular SafeSpace
    isMember(spaceName, member) {
        if (this.spaces[spaceName] === undefined) {
            throw new Error(`SafeSpace ${spaceName} does not exist.`);
        }
        return this.spaces[spaceName].isMember(member);
    }

    // Method to provide a list of all members of a particular SafeSpace
    listMembers(spaceName) {
        if (this.spaces[spaceName] === undefined) {
            throw new Error(`SafeSpace ${spaceName} does not exist.`);
        }
        return this.spaces[spaceName].listMembers();
    }

    // Method to check if a particular SafeSpace is empty
    isEmpty(spaceName) {
        if (this.spaces[spaceName] === undefined) {
            throw new Error(`SafeSpace ${spaceName} does not exist.`);
        }
        return this.spaces[spaceName].isEmpty();
    }

    // Method to get the size of a particular SafeSpace
    size(spaceName) {
        if (this.spaces[spaceName] === undefined) {
            throw new Error(`SafeSpace ${spaceName} does not exist.`);
        }
        return this.spaces[spaceName].size();
    }

}

// Create a function to initialize and get a instance of SafeSpaceManager
const initializeSafeSpaceManager = () => {
    const manager = new SafeSpaceManager();
    return manager;
};