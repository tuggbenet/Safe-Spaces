#include <stdio.h>

// Create a safe space to facilitate open discussion
int main()
{
	// Declare the variables
	int resp, i;
	// Create an array to store responses
	int responses[2000] = {0};

	// Prompt the user to answer the survey
	printf("Welcome to the safe space survey! Please answer the questions with a 0 for no and a 1 for yes.\n");

	// Loop through the survey 2000 times to capture responses
	for (i=0; i<2000; i++)
	{
		printf("Do you feel safe in this space? ");
		scanf("%d", &resp);

		// Store responses in an array
		responses[i] = resp;
	}

	// Output the responses
	printf("Responses: \n");
	for (i=0; i<2000; i++)
	{
		printf("%d\n", responses[i]);
	}

	// Output the results
	printf("Results: \n");
	int n_yes = 0;
	int n_no = 0;

	for (i=0; i<2000; i++)
	{
		if (responses[i] == 1) 
			n_yes++;
		else
			n_no++;
	}

	printf("Number of Yes responses: %d\n", n_yes);
	printf("Number of No responses: %d\n", n_no);

	return 0;
}