/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor ^^^^^^^^^^^^^^^ THIS IS BRANCH
 */
package practise;

/**
 *
 * @author Hasan Khan
 */
public class Cube extends Square implements ThreeD
{


public Cube(double side)

{

super(side);

}

public double getVolume()

{

return getSide() * getSide()* getSide();

}

public double AreaCube()

{

return 6 * super.AreaSquare();

}
    
}
