<?php

/**
 * Малка игра, в която ще има двама играчи.
 * Играчите ще имат живот и атака.
 * При атака от един играч към друг, ще се отнема
 * съответното количество живот. Докато един от играчите
 * не остане с 0 или по-малко живот.
 *
 * Играч
 *    - Име
 *    - Живот
 *    - атака
 *
 * Конструктор(Име, Живот, Атака)
 *
 * Действие
 *    - Атака
 *    - Живот
 *    - ПокажиМиАтакатаНаИграча
 */
class Player
{
    private static $lastId;

    private $id;
    private $name;
    private $health;
    private $attack;

    public function __construct(string $name, int $health, int $attack)
    {
        $this->name = $name;
        $this->health = $health;
        $this->attack = $attack;
        $this->id = ++self::$lastId;
    }

    public function getName()
    {
        return $this->name;
    }

    public function getId() : int
    {
        return $this->id;
    }

    public function getAttack() : int
    {
        return $this->attack;
    }

    public function reduceHealth(int $health)
    {
        return $this->health -= $health;
    }

    public function isAlive() : bool
    {
        return $this->health > 0;
    }

    public function attack(Player $player) : void
    {
        if ($player->getId() == $this->getId()){
            throw new Exception(("Cannot attack yourself!"));
        }
        $player -> reduceHealth($this->getAttack());
    }
}


$rounds = 10;
$player1 = new Player("Player one", 30,8);
$player2 = new Player("Player two", 34,6);

while ($rounds > 0 && $player2->isAlive() && $player1->isAlive()){
    $player1->attack($player2);
    $player2->attack($player1);
    $rounds--;
}
if ($player1->isAlive() == $player2->isAlive()){
    echo "DRAW BATTLE";
} else {
    $winner = $player1->isAlive() ? $player1 : $player2;
    echo "The Winner is : " . $winner->getName();
}