#include <string>
#include "Vec2D.hpp"
#include "Comparable.hpp"
#ifndef _ENTITY_
#define _ENTITY_

//#include <iostream>
//using namespace std;


class Entity
{
protected:
    /* data */
    Vec2D * pos;
    std::string name;
    int energy;

public:
    Entity(Vec2D * p, std::string n, int e): pos(p), name(n), energy(e){}
    

    std::string getName(){
        return name;
    }

    void setName(std::string n){
        name = n;
    }

    int compareTo(Entity * e){

        if(this->energy > e->energy){
            return 1;
        }
        else if(this->energy < e->energy){
            return -1;
        }else{
            return 0;
        }

    }

    virtual void update(){}

};



#endif _ENTITY_

