
#include <string>
#include "Vec2D.hpp"
#include "Entity.hpp"
#include <iostream>
#ifndef _AGENT_
#define _AGENT_


class Agent: public Entity
{
private:
    /* data */
    double radius;
    Vec2D * direction;
    Vec2D * target;
    double speed;

public:
    Agent(Vec2D * p, std::string n, int e, double r ):  Entity(p, n, e), radius(r) {}

    void setTarget(Vec2D * v){
        target = v;
        Vec2D * dir = new Vec2D(target);
        dir->subtract(pos);
        dir->normalize();
    }

    void setSpeed(double s){
        speed = s;
    }

    void update(){
        
        Vec2D * vector = new Vec2D(speed*(direction->getX()), speed*(direction->getY()));
        pos->add(vector);
    }

    bool targetReached(){

        Vec2D * vect = new Vec2D(pos->getX()-target->getX(), pos->getY()-target->getY());
        if(vect->length() < radius){
            std::cout << "Ha llegado a su target";
            return true;
        }else{
            std::cout << "Aun no ha llegado a su target";
            return false;
        }
    }

    bool isColliding(Agent a){

        Vec2D * vector = new Vec2D(direction);
        vector->subtract(a.direction);

        if(vector->length() < (radius + a.radius)){
            return true;
        }else{
            return false;
        }
    }

    

};



#endif _AGENT_

