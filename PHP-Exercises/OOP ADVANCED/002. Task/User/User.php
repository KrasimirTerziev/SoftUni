
<?php


class User
{
   private static $lastId;

   private $id;
   private $username;
   private $password;
    /// зададени въпроси
   private $questions = [];
    ///отговор
   private $answers = [];
   private $comments = [];
    /**
     * User constructor.
     * @param $username
     * @param $password
     */
    public function __construct($username, $password)
    {
        /**
        * $this->username = $username;
        * $this->password = $password;
        */
        $this->setUsername($username);
        $this->setPassword($password);

    }

    /**
     * @return mixed
     */
    public function getUsername()
    {
        return $this->username;
    }

    /**
     * @return mixed
     */
    public function getPassword()
    {
        return $this->password;
    }

    /**
     * @return mixed
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @param mixed $username
     */
    public function setUsername($username)
    {
        $this->username = $username;
    }


    public function setPassword($password)
    {
        if(!preg_match("/[0-9]+", $password)){
            throw new Exception("Password should contain digits");
        }
        if(!preg_match("/[a-z]+", $password)){
            throw new Exception("Password should containe letters");
        }
        $this->password = $password;
    }

    public function getQuestions()
    {
        return $this->questions;
    }

    public function askQuestion(Question $question)
    {
        $this->questions[] = $question;
    }

    public function getAnswers(): array
    {
        return $this->answers;
    }

    public function answer(Question $question, Answer $answer)
    {
        $this->answer[] = $answer;
        $question->answer($answer);
    }

    public function getComments(): array
    {
        return $this->comments;
    }

    public function comment(Answer $comment, Answer $answer)
    {
        $this->comment[] = $comment;
        $answer->comment($comment);
    }


}