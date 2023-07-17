clear all;
close all;

% define and set variables
numSpaces = 2000;
spaceArray = zeros(numSpaces,2);

% create space array
for k=1:numSpaces
    spaceArray(k,1) = k;
    spaceArray(k,2) = randi([0 1]);
end

% check if space is safe
for k=1:numSpaces
    if spaceArray(k,2) == 1
        display(['Space ' num2str(spaceArray(k,1)) ' is safe.'])
    else
        display(['Space ' num2str(spaceArray(k,1)) ' is not safe.'])
    end
end

% plot safe spaces
safeSpaces = find(spaceArray(:,2) == 1);
unsafeSpaces = find(spaceArray(:,2) == 0);

plot(safeSpaces,zeros(length(safeSpaces),1),'go')
hold on
plot(unsafeSpaces,zeros(length(unsafeSpaces),1),'rx')
title('Safe Spaces')
ylabel('Safety Status')
xlabel('Space Number')
legend('Safe','Unsafe')