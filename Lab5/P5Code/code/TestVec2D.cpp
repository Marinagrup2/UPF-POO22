
#include <iostream>
#include "Vec2D.hpp"
#include "Entity.hpp"
#include "Agent.hpp"

int main() {
	// create instances directly
	Vec2D v1(2, 3);
	Vec2D v2(4, 5);
	
	// pass v1 as a pointer
	v2.subtract(&v1);
	std::cout << v2.length() << "\n";
	
	// create instances using pointers
	Vec2D * v3 = new Vec2D(2, 3);
	Vec2D * v4 = new Vec2D(4, 5);

	Entity * en = new Entity(v3, "name", 20);
	Entity * ent = new Entity(v4, "namee", 25);
	en->compareTo(ent);
	std::cout << en->getName()<< "\n";

	Agent * a = new Agent(v3, "name", 20, 5);
	a->setTarget(v4);
	a->setSpeed(4.0);
	//a->update();

	
	// use "->" to call methods on a pointer
	// v3 is already a pointer
	v4->subtract(v3);
	std::cout << v4->length() << "\n";

	
	
	// instances created using "new" have to be deleted
	delete v3;
	delete v4;
	delete en;
	delete ent;
	delete a;

}

