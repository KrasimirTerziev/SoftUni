<?php
/*
 * Using the Person class, write a program that reads from the console N lines of personal information and then prints
 * all people whose age is more than 30 years, sorted in alphabetical order.
 */

class Person
{
    private $name;
    private $age;

    public function __construct(string $name, int $age)
    {
        $this->name = $name;
        $this->age = $age;
    }

    /**
     * @return string
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * @param string $name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
    }

    /**
     * @return int
     */
    public function getAge(): int
    {
        return $this->age;
    }

    /**
     * @param int $age
     */
    public function setAge(int $age): void
    {
        $this->age = $age;
    }

    public function printPerson()
    {
        return "{$this->getName()} - {$this->getAge()}". PHP_EOL;
    }
}

$n = intval(readline());

$persons = [];
while ($n-- > 0) {
    $input = explode(" ", readline());
    $name = $input[0];
    $age = intval($input[1]);

    $persons[] = new Person($name, $age);
}
$filterPeople = array_filter($persons, function (Person $person) {
    return $person->getAge() > 30;
});
usort($filterPeople, function (Person $p1, $p2) {
    return $p1->getName() <=> $p2->getName();
});

foreach ($filterPeople as $person) {
    echo $person->printPerson();
}