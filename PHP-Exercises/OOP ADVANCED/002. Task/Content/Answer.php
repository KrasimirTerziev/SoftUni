<?php


class Answer
{
   const Body_Min_Lenght =  7;

   private static $lastId;

    /**
     * @var int
     */
   private $id;
    /**
     * @var string
     */
   private $body;
    /**
     * @var User
     */
   private $author;
    /**
     * @var Question
     */
   private $question;
    /**
     * @var Answer
     */
   private $answer;
    /**
     * @var Answer[]
     */
   private $comments = [];

    /**
     * Answer constructor.
     * @param string $body
     * @param User $author
     * @param Question $question
     * @param Answer $answer
     */
    public function __construct(string $body,
                                User $author,
                                Question $question,
                                Answer $answer = null)
    {
        $this->setBody($body);
        $this->setAuthor($author);
        $this->setQuestion($question);
        $this->setAnswer($answer);
        $this->id= ++ self :: $lastId;
    }


    /**
     * @return string
     */
    public function getBody(): string
    {
        return $this->body;
    }


    public function setBody(string $body)
    {
        if (strlen($body)< self::Body_Min_Lenght){
            throw new Exception("Title is too short");
        }
        $this->body = $body;
    }

    /**
     * @return User
     */
    public function getAuthor(): User
    {
        return $this->author;
    }

    /**
     * @param User $author
     */
    public function setAuthor(User $author)
    {
        $this->author = $author;
    }

    /**
     * @return Question
     */
    public function getQuestion(): Question
    {
        return $this->question;
    }

    /**
     * @param Question $question
     */
    public function setQuestion(Question $question)
    {
        $this->question = $question;
    }

    /**
     * @return Answer
     */
    public function getAnswer(): Answer
    {
        return $this->answer;
    }

    /**
     * @param Answer $answer
     */
    public function setAnswer(Answer $answer = null)
    {
        $this->answer = $answer;
    }

    public function comment(Answer $answer)
    {
        $this->comments[]= $answer;
    }

    /**
     * @return int
     */
    public function getId(): int
    {
        return $this->id;
    }

    /**
     * @return Answer[]
     */
    public function getComments(): array
    {
        return $this->comments;
    }

}