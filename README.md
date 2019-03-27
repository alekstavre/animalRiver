# animalRiver
test project
Write a Java program to simulate an ecosystem containing two types of creatures,bearsandfish. The ecosystem consists of a river, which is modeled as a relativelylarge array. Each cell of the array should contain anAnimalobject, which canbe aBearobject, aFishobject, ornull. In each time step, based on a randomprocess, each animal either attempts to move into an adjacent array cell or staywhere it is. If two animals of the same type are about to collide in the samecell, then they stay where they are, but they create a new instance of that typeof animal, which is placed in a random empty (i.e., previouslynull) cell in thearray. If a bear and a fish collide, however, then the fish dies (i.e., it disappears).Use actual object creation, via thenewoperator, to model the creation of newobjects, and provide a visualization of the array after each time step.