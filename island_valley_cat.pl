#!/usr/bin/perl

# This Perl script helps faculty create and manage 'Safe Spaces' in and out of the classroom.

# Define a variable to store the list of faculty who have created Safe Spaces
my @faculty_list;

# Establish a loop to allow faculty to register and create a Safe Space
while (1) {
	print 'Please enter the name of the faculty member who will create a Safe Space: ';
	my $faculty_name = <STDIN>;
	chomp($faculty_name);
	push @faculty_list, $faculty_name;
	
	print "Would you like to create another Safe Space? (y/n) ";
	my $answer = <STDIN>;
	chomp($answer);
	
	last if ($answer eq 'n' || $answer eq 'N');
}

# Create a hash to store Safe Space information for each faculty member
my %faculty_safe_spaces;
for my $faculty_name (@faculty_list) {
	
	print 'Please enter the name of the Safe Space: ';
	my $safe_space_name = <STDIN>;
	chomp($safe_space_name);
	
	print 'Please enter the location of the Safe Space: ';
	my $safe_space_location = <STDIN>;
	chomp($safe_space_location);
	
	# Store the Safe Space information in the hash
	$faculty_safe_spaces{$faculty_name} = {
		name => $safe_space_name,
		location => $safe_space_location
	};
}

# Ask each faculty member to update their Safe Space info
for my $faculty_name (keys %faculty_safe_spaces) {
	print "$faculty_name, would you like to update your Safe Space information? (y/n) ";
	my $update_answer = <STDIN>;
	chomp($update_answer);
	
	if ($update_answer eq 'y' || $update_answer eq 'Y') {
		print 'Please enter the new name of the Safe Space: ';
		my $updated_name = <STDIN>;
		chomp($updated_name);
		
		print 'Please enter the new location of the Safe Space: ';
		my $updated_location = <STDIN>;
		chomp($updated_location);
		
		# Update the Safe Space information in the hash
		$faculty_safe_spaces{$faculty_name}{name} = $updated_name;
		$faculty_safe_spaces{$faculty_name}{location} = $updated_location;
	}
}

# Print the names and locations of all of the Safe Spaces
print "The following Safe Spaces have been created:\n";
for my $faculty_name (keys %faculty_safe_spaces) {
	print "$faculty_name: $faculty_safe_spaces{$faculty_name}{name} ($faculty_safe_spaces{$faculty_name}{location})\n";
}