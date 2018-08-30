<?php


class Question
{
    const Title_Min_Lenght = 3;
    const Body_Min_Lenght = 10;

    private static $lastId;

    private $id;
    private $title;
    private $body;
    private $author;
    private $answers = [];

    /**
     * Question constructor.
     * @param $title
     * @param $body
     * @param $author
     */
    public function __construct(string $title, string $body, User $author)
    {
        $this->setTitle($title);
        $this->setBody($body);
        $this->setAuthor($author);
        $this->id= ++ self :: $lastId;
    }


    public function setTitle(string $title)
    {
        if (strlen($title)< self::Title_Min_Lenght){
            throw new Exception("Title is too short");
        }
        $this->title = $title;
    }

    public function getTitle(): string
    {
        return $this->title;
    }

    public function setBody(string $body)
    {
        if (strlen($body)< self::Body_Min_Lenght){
            throw new Exception("Title is too short");
        }
        $this->body = $body;
    }

    public function getBody(): string
    {
        return $this->body;
    }

    public function getAuthor(): User
    {
        return $this->author;
    }

    public function setAuthor(User $author)
    {
        $this->author = $author;
    }

    public function getId()
    {
        return $this->id;
    }


    public function getAnswers(): array
    {
        return $this->answers;
    }

    public function answer(Answer $answer)
    {
        $this->answer[] = $answer;
    }
}