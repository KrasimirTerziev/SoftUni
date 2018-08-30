<?php
/**
 * Your task is to implement a program that keeps track of cars and their fuel and supports methods for moving the cars.
 * Define a class Car that keeps track of a car’s Model, fuel amount, fuel cost for 1 kilometer and distance traveled.
 * A Car’s Model is unique - there will never be 2 cars with the same model.
 * On the first line of the input you will receive a number N – the number of cars you need to track,
 * on each of the next N lines you will receive information for a car in the following format
 * “<Model> <FuelAmount> <FuelCostFor1km>”, all cars start at 0 kilometers traveled.
 *
 *  After the N lines until the command “End” is received, you will receive a commands in the following format
 * “Drive <CarModel>  <amountOfKm>”, implement a method in the Car class to calculate whether or not a car
 * can move that distance, if it can the car’s fuel amount should be reduced by the amount of used fuel and
 * its distance traveled should be increased by the amount of kilometers traveled, otherwise the car should
 * not move (Its fuel amount and distance traveled should stay the same) and you should print on the console
 * “Insufficient fuel for the drive”. After the “End” command is received, print each car and its current
 * fuel amount and distance traveled in the format “<Model> <fuelAmount>  <distanceTraveled>”,
 * where the fuel amount should be printed to two decimal places after the separator.
 */

/**
 *   Клас кола
 *      - модел;
 *      - заредено гориво;
 *      - разход на км.;
 *      - пробег;
 *      * придвижи (км) /заредено гориво, пробег/;
 *      * __toString(Модел, останало гориво, пробег);
 *
 *   1. Да направим класа "Кола".
 *   2. Да имплементираме метода за придвижване.
 *   3. Да четем от входа и
 *      да записваме коли в асоциативен масив по модел.
 *   4. Четем от входа команди, намираме кола по модел от
 *      асоциативния масив от т.3.
 *      и извикваме на тази кола метода за придвижване.
 *   5. Четем "END" и обхождаме масива с коли и принтираме всяка кола.
 */


class Car
{
    public $model;
    public $fuelAmount;
    public $fuelCost;
    public $distanceTravelled;

    public function __constrict(string $model,
                                float $fuelAmount,
                                float $fuelCost)
    {
        $this->model = $model;
        $this->fuelAmount = $fuelAmount;
        $this->fuelCost = $fuelCost;
        $this->distanceTravelled = 0;
    }

    public function drive(float $km)
    {
        $cost = $km * $this->fuelCost;
        if($cost> $this->fuelAmount){
            throw new Exception("Insufficient fuel for the drive");
        }
        $this->fuelAmount -= $cost;
        $this->distanceTravelled += $km;
    }

    public function __toString()
    {
        return $this->model.' '
            .round($this->fuelAmount, 2).' '
            .round($this->distanceTravelled, 2);
    }
}

$car = new Car("AudiA4", 23.346, 0.3);
echo $car;








