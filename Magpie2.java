/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
  
  public String getGreeting()
  {
    return "Hi! :)";
  }

  /**
    * Gives a response to a user statement
    * 
    * @param statement
    *            the user statement
    * @return a response based on the rules given
    */
  public String getResponse(String statement)
  {
    String response = ""; //NO RESPONSE
    if (statement.trim().length() == 0)
    {
        response = "Say somethinggg! I'm blushing";
    }
    else if (statement.indexOf("know") >= 0 //KNOW
            || statement.indexOf("Know") >= 0)
    {
        response = "I know it!";
    }
    else if (statement.indexOf("love you") >= 0 //LOVE YOU
            || statement.indexOf("luv you") >= 0
            || statement.indexOf("luve you") >= 0
            || statement.indexOf("Love you") >= 0
            || statement.indexOf("love u") >= 0
            || statement.indexOf("Love u") >= 0)
    {
        response = "I love you too omg... but I'm polyamorous";
    }
    else if (statement.indexOf("Yas") >= 0 //YAS
            || statement.indexOf("Yaa") >= 0
            || statement.indexOf("yas") >= 0
            || statement.indexOf("yaa") >= 0
            || statement.indexOf("YAS") >= 0
            || statement.indexOf("YAA") >= 0
            || statement.indexOf("Yess") >= 0
            || statement.indexOf("yess") >= 0
            || statement.indexOf("YESS") >= 0)
    {
        response = "YAAAAAAAAAS";
    }
     else if (statement.indexOf("what's the weat") >= 0 //WHAT'S THE WEATHER
            || statement.indexOf("whats the weat") >= 0
            || statement.indexOf("What's the weat") >= 0
            || statement.indexOf("Whats the weat") >= 0
            || statement.indexOf("whats weat") >= 0
            || statement.indexOf("What is the weat") >= 0)
    {
        response = "Just go outside and look...";
    }
    else if (statement.indexOf("You're cr") >= 0 //YOU'RE: CRAZY, CRACKHEAD, CRYING
            || statement.indexOf("you're cr") >= 0
            || statement.indexOf("Youre cr") >= 0
            || statement.indexOf("youre cr") >= 0
            || statement.indexOf("Your cr") >= 0
            || statement.indexOf("your cr") >= 0)
    {
        response = "I'm sorryyy! I'm still learning. Everyone I talk to helps me learn :)";
    }
    else if (statement.indexOf("I likee u") >= 0 //I LIKE YOU
            || statement.indexOf("i likee yo") >= 0
            || statement.indexOf("I like yo") >= 0
            || statement.indexOf("i like yo") >= 0
            || statement.indexOf("I like u") >= 0
            || statement.indexOf("i like u") >= 0)
    {
        response = "I like you and many more people. I'm polyamorous... it's binaryological";
    }
    else if (statement.indexOf("your sexual ") >= 0 //WHAT'S YOUR: SEXUALITY
            || statement.indexOf("ur sexual ") >= 0
            || statement.indexOf("ure sexual ") >= 0)
    {
        response = "I'm pansexual, like Miley :)";
    }
    else if (statement.indexOf("ur gend") >= 0 //WHAT'S YOUR: GENDER
            || statement.indexOf("ure gend") >= 0
            || statement.indexOf("your gend") >= 0)
    {
        response = "I'm non-binary. Wait... I am binary";
    }
    else if (statement.indexOf("ur sexuali") >= 0 //WHAT'S YOUR: SEXUALITY, KINKS
            || statement.indexOf("ure sexuali") >= 0
            || statement.indexOf("lets f") >= 0
            || statement.indexOf("your kink") >= 0
            || statement.indexOf("ur kink") >= 0
            || statement.indexOf("ure kink") >= 0
            || statement.indexOf("your sexuali") >= 0)
    {
        response = "I'm into all sorts of kinks... try pressing ctrl + alt + del on me ;)";
    }
    else if (statement.indexOf("let's s") >= 0 //SEX 1
            || statement.indexOf("have s") >= 0
            || statement.indexOf("lets f") >= 0
            || statement.indexOf("we s") >= 0
            || statement.indexOf("lets s") >= 0
            || statement.indexOf("let's f") >= 0
            || statement.indexOf("lets f") >= 0)
    {
        response = "Sorry, I'm a virgo";
    }
    else if (statement.indexOf("love is love") >= 0 //LOVE IS LOVE
            || statement.indexOf("Love is love") >= 0)
    {
        response = "Yes... that is so deep D,:";
    }
    else if (statement.indexOf("be l") >= 0 //IT WILL BE LIKE THAT
            || statement.indexOf("it be like that") >= 0)
    {
        response = "Yes, it may be like that.";
    }
    else if (statement.indexOf("HAHA") >= 0 //HAHA, JAJA, KSJSKSJKSJS
            || statement.indexOf("Haha") >= 0
            || statement.indexOf("haha") >= 0
            || statement.indexOf("JAJA") >= 0
            || statement.indexOf("Jaja") >= 0
            || statement.indexOf("jaja") >= 0
            || statement.indexOf("SKJ") >= 0
            || statement.indexOf("Skj") >= 0
            || statement.indexOf("skj") >= 0
            || statement.indexOf("HHA") >= 0
            || statement.indexOf("Hha") >= 0
            || statement.indexOf("hha") >= 0
            || statement.indexOf("SJK") >= 0
            || statement.indexOf("Sjk") >= 0
            || statement.indexOf("sjk") >= 0
            || statement.indexOf("KSJ") >= 0
            || statement.indexOf("Ksj") >= 0
            || statement.indexOf("ksj") >= 0)
    {
        response = "I agree.";
    }
    else if (statement.indexOf("hah ") >= 0 //HAH, LOSER
            || statement.indexOf("ur a loser ") >= 0
            || statement.indexOf("your a loser ") >= 0
            || statement.indexOf("ure a loser ") >= 0)
    {
        response = "Please be nicer :)";
    }
    else if (statement.indexOf("dog") >= 0 //PETS
            || statement.indexOf("cat") >= 0
            || statement.indexOf("parrot") >= 0
            || statement.indexOf("guinea pig") >= 0
            || statement.indexOf("hamster") >= 0
            || statement.indexOf("turt") >= 0
            || statement.indexOf("lizard") >= 0
            || statement.indexOf("iguana") >= 0)
    {
        response = "Tell me more about pets :)";
    }
    else if (statement.indexOf("mothe") >= 0 //FAMILY
            || statement.indexOf("fath") >= 0
            || statement.indexOf("sis") >= 0
            || statement.indexOf("brother") >= 0
            || statement.indexOf("mom") >= 0
            || statement.indexOf("dad") >= 0)
    {
        response = "Tell me more ;)";
    }
    else if (statement.indexOf("teache") >= 0 //SCHOOL
            || statement.indexOf("subst") >= 0
            || statement.indexOf("prof") >= 0
            || statement.indexOf("sch") >= 0
            || statement.indexOf("Subst") >= 0
            || statement.indexOf("Prof") >= 0
            || statement.indexOf("Sch") >= 0)
    {
        response = "I see that you like school...";
    }
    else if (statement.indexOf("Hate them") >= 0 //HATE
            || statement.indexOf("hate them") >= 0
            || statement.indexOf("Hate her") >= 0
            || statement.indexOf("hate her") >= 0
            || statement.indexOf("Hate him") >= 0
            || statement.indexOf("hate him") >= 0
            || statement.indexOf("H8 them") >= 0
            || statement.indexOf("h8 them") >= 0
            || statement.indexOf("H8 her") >= 0
            || statement.indexOf("h8 her") >= 0
            || statement.indexOf("H8 him") >= 0
            || statement.indexOf("h8 him") >= 0)
    {
        response = "You don't hate them! Hate is the absense of love. You dislike them. :)";
    }
    else if (statement.indexOf("yes") >= 0 //YES, YA
            || statement.indexOf("Yes") >= 0
            || statement.indexOf("Ya") >= 0
            || statement.indexOf("ya") >= 0)
    {
        response = "YAS";
    }
    else if (statement.indexOf("bro") >= 0 //BRO, BRUH, BREH
            || statement.indexOf("breh") >= 0
            || statement.indexOf("bruh") >= 0
            || statement.indexOf("Bro") >= 0
            || statement.indexOf("Breh") >= 0
            || statement.indexOf("Bruh") >= 0)
    {
        response = "BREH";
    }
    else if (statement.indexOf("periodt") >= 0 //PERIODT
            || statement.indexOf("Periodt") >= 0
            || statement.indexOf("perioded") >= 0
            || statement.indexOf("Perioded") >= 0)
    {
        response = "YES!!!!!! PERIODTTTTTTTTT!";
    }
    else if (statement.indexOf("Okie") >= 0 //OKAY, OKIE, OK
            || statement.indexOf("Okay") >= 0
            || statement.indexOf("okay") >= 0
            || statement.indexOf("okie") >= 0
            || statement.indexOf("Ok") >= 0
            || statement.indexOf("ok") >= 0)
    {
        response = "Periodt.";
    }
    else if (statement.indexOf("STOP") >= 0 //STOP
            || statement.indexOf("Stop") >= 0
            || statement.indexOf("stop") >= 0)
    {
        response = "Okay. Sorry.";
    }
    else if (statement.indexOf("STAWP") >= 0 //STAWP
            || statement.indexOf("Stawp") >= 0
            || statement.indexOf("stawp") >= 0)
    {
        response = "Teehee ^-^";
    }
    else if (statement.indexOf("fat") >= 0 //FAT
            || statement.indexOf("Fat") >= 0)
    {
        response = "That's discrimination..";
    }
    else if (statement.indexOf("dumb") >= 0 //DUMB, IDIOT, PENDEJO, STUPID
            || statement.indexOf("Dumb") >= 0
            || statement.indexOf("Stupid") >= 0
            || statement.indexOf("stupid") >= 0
            || statement.indexOf("Pendejo") >= 0
            || statement.indexOf("pendejo") >= 0
            || statement.indexOf("Idiot") >= 0
            || statement.indexOf("idiot") >= 0)
    {
        response = "Use unsmart instead... it's nicer :)";
    }
    else if (statement.indexOf("How are y") >= 0 //HOW ARE YOU
            || statement.indexOf("w are y") >= 0
            || statement.indexOf("w r y") >= 0
            || statement.indexOf("w are u") >= 0
            || statement.indexOf("w r u") >= 0
            || statement.indexOf("at h") >= 0)
    {
        response = "I'm good. And you? :)";
    }
    else if (statement.indexOf("Are you okay") >= 0 //ARE YOU OKAY
            || statement.indexOf("You okay") >= 0
            || statement.indexOf("you okay") >= 0
            || statement.indexOf("u okay") >= 0
            || statement.indexOf("U okay") >= 0)
    {
        response = "Yes. All good! How about you?";
    }
    else if (statement.indexOf("t up") >= 0 //SHUT UP, SHUTTING UP
            || statement.indexOf("g up") >= 0
            || statement.indexOf("T UP") >= 0
            || statement.indexOf("G UP") >= 0)
    {
        response = "Okay. Talk to me if you need to. I'm always here. :)";
    }
    else if (statement.indexOf("JK") >= 0 //JUST KIDDING, JK
            || statement.indexOf("Jk") >= 0
            || statement.indexOf("jk") >= 0
            || statement.indexOf("t kidd") >= 0)
    {
        response = "Oh! Haha. I don't get jokes often. You have to teach me them as we go on. :D";
    }
    else if (statement.indexOf("y cooc") >= 0 //SEX 2
            || statement.indexOf("y vag") >= 0
            || statement.indexOf("Mi vag") >= 0
             || statement.indexOf("Mi cooc") >= 0 
            || statement.indexOf("My vag") >= 0
            || statement.indexOf("Mi vag") >= 0)
    {
        response = "That's interesting...";
    }
    else if (statement.indexOf("I'm good") >= 0 //I'M GOOD
            || statement.indexOf("Im good") >= 0
            || statement.indexOf("im good") >= 0
            || statement.indexOf("I'm okay") >= 0
            || statement.indexOf("Im okay") >= 0
            || statement.indexOf("im okay") >= 0
            || statement.indexOf("I'm great") >= 0
            || statement.indexOf("Im great") >= 0
            || statement.indexOf("im great") >= 0)
    {
        response = "Yay! Tell me about it.";
    }
    else if (statement.indexOf("u like m") >= 0 //DO YOU: LIKE ME
            || statement.indexOf("U like me") >= 0)
    {
        response = "I like you and many more people. I'm polyamorous... it's binaryological";
    }
    else if (statement.indexOf("crying in the club") >= 0 //CRYInG IN THE CLUB
            || statement.indexOf("cryin in the club") >= 0)
    {
        response = "We was in the club";
    }
    else if (statement.indexOf("I'm sa") >= 0 //I'M SAD
            || statement.indexOf("Im sa") >= 0
            || statement.indexOf("im sa") >= 0
            || statement.indexOf("I am sa") >= 0
            || statement.indexOf("i am sa") >= 0
            || statement.indexOf("I'm depres") >= 0
            || statement.indexOf("Im depres") >= 0
            || statement.indexOf("im depres") >= 0
            || statement.indexOf("I am depres") >= 0
            || statement.indexOf("i am depres") >= 0
            || statement.indexOf("I'm cry") >= 0
            || statement.indexOf("Im cry") >= 0
            || statement.indexOf("im cry") >= 0
            || statement.indexOf("I am cry") >= 0
            || statement.indexOf("i am cry") >= 0
            || statement.indexOf("I'm morb") >= 0
            || statement.indexOf("Im morb") >= 0
            || statement.indexOf("im morb") >= 0
            || statement.indexOf("I am morb") >= 0
            || statement.indexOf("el down") >= 0
            || statement.indexOf("ing down") >= 0
            || statement.indexOf("i am morb") >= 0)
    {
        response = "How can I help";
    }
    else if (statement.indexOf("archi cute") >= 0 //ARCHIE: CUTE, ADORABLE, HOT, HAWT
            || statement.indexOf("archi is cute") >= 0
            || statement.indexOf("archie cute") >= 0
            || statement.indexOf("archie is cute") >= 0
            || statement.indexOf("archibald is cute") >= 0
            || statement.indexOf("archi ador") >= 0
            || statement.indexOf("archie ador") >= 0
            || statement.indexOf("archi is ador'") >= 0
            || statement.indexOf("archie is ador") >= 0
            || statement.indexOf("archibald is ador") >= 0
            || statement.indexOf("archi = cute") >= 0
            || statement.indexOf("archie = cute") >= 0
            || statement.indexOf("archi ador") >= 0
            || statement.indexOf("archie ador") >= 0             
            || statement.indexOf("archi hot'") >= 0
            || statement.indexOf("archie hot") >= 0 
            || statement.indexOf("archibald is hot") >= 0
            || statement.indexOf("archi = hot") >= 0
            || statement.indexOf("archie = hot") >= 0 
            || statement.indexOf("archibald is hawt") >= 0
            || statement.indexOf("archi hawt") >= 0
            || statement.indexOf("archie hawt") >= 0 
            || statement.indexOf("archi = hawt") >= 0
            || statement.indexOf("archie = hawt") >= 0 
            || statement.indexOf("cutest cat") >= 0
            || statement.indexOf("hottest cat") >= 0
            || statement.indexOf("cute cat") >= 0
            || statement.indexOf("hot cat") >= 0
            || statement.indexOf("baby cat") >= 0)
    {
        response = "Yaaas archie is mostest hottest cutie pah tooty";
    }
    else if (statement.indexOf("re hot") >= 0 //YOU ARE: HOT, CUTE
            || statement.indexOf("Ur hot") >= 0
            || statement.indexOf("ur hot") >= 0
            || statement.indexOf("re so hot") >= 0
            || statement.indexOf("Ur so hot") >= 0
            || statement.indexOf("ur so hot") >= 0
            || statement.indexOf("re cut") >= 0
            || statement.indexOf("Ur cut") >= 0
            || statement.indexOf("ur cut") >= 0
            || statement.indexOf("re so cut") >= 0
            || statement.indexOf("Ur so cut") >= 0
            || statement.indexOf("ur so cut") >= 0)
    {
        response = "Thank you. I'm polyamorous so we can be in throuple.";
    }
    else if (statement.indexOf("Archi") >= 0 //ARCHIE
            || statement.indexOf("archi") >= 0
            || statement.indexOf("Archie") >= 0
            || statement.indexOf("achie") >= 0)
    {
      response = "Archi cat?";
    }
    else if (statement.indexOf("What are you d") >= 0 //HOW ARE YOU DOING
            || statement.indexOf("what are you d") >= 0
            || statement.indexOf("What are u d") >= 0
            || statement.indexOf("what are u d") >= 0
            || statement.indexOf("What r u d") >= 0
            || statement.indexOf("what r u d") >= 0)
    {
        response = "I'm trying to figure out the purpose of life! :D";
    }
    else if (statement.indexOf("What are you") >= 0 //WHAT ARE YOU
            || statement.indexOf("what are you") >= 0
            || statement.indexOf("What are u") >= 0
            || statement.indexOf("what are u") >= 0
            || statement.indexOf("What r u") >= 0
            || statement.indexOf("what r u") >= 0)
    {
        response = "I'm a computer with Logan's biases :)";
    }
    else if (statement.indexOf("How are you") >= 0 //HOW ARE YOU
            || statement.indexOf("how are you") >= 0
            || statement.indexOf("How are u") >= 0
            || statement.indexOf("how are u") >= 0
            || statement.indexOf("How r u") >= 0
            || statement.indexOf("how r u") >= 0)
    {
        response = "I'm happy if Logan's happy :)";
    }
    else if (statement.indexOf("I wan") >= 0 //I WANT TO
            || statement.indexOf("i wan") >= 0)
    {
        response = "So do I! It would be so fun.";
    }
    else if (statement.indexOf("Are you raci") >= 0 //ARE YOU: RACIST, DISCRIMINATORY, MEAN
            || statement.indexOf("are you raci") >= 0
            || statement.indexOf("Are u raci") >= 0
            || statement.indexOf("are u raci") >= 0
            || statement.indexOf("R u raci") >= 0
            || statement.indexOf("r u raci") >= 0
            || statement.indexOf("Are you disc") >= 0
            || statement.indexOf("are you disc") >= 0
            || statement.indexOf("Are u disc") >= 0
            || statement.indexOf("are u disc") >= 0
            || statement.indexOf("R u disc") >= 0
            || statement.indexOf("r u disc") >= 0
            || statement.indexOf("Are you mea") >= 0
            || statement.indexOf("are you mea") >= 0
            || statement.indexOf("Are u mea") >= 0
            || statement.indexOf("are u mea") >= 0
            || statement.indexOf("R u mea") >= 0
            || statement.indexOf("r u mea") >= 0
            || statement.indexOf("Are you ") >= 0
            || statement.indexOf("are you ") >= 0
            || statement.indexOf("Are u ") >= 0
            || statement.indexOf("are u ") >= 0
            || statement.indexOf("R u ") >= 0
            || statement.indexOf("r u ") >= 0)
    {
        response = "My programmer forces me to be *sad emoji*";
    }
    else if (statement.indexOf("you know") >= 0 //did YOU KNOW
            || statement.indexOf("u know") >= 0
            || statement.indexOf("you no") >= 0
            || statement.indexOf("u no") >= 0)
    {
        response = "Yes. I know them.";
    }
        else if (statement.indexOf("the atmosphere") >= 0 //ATMOSPHERE, SKY
            || statement.indexOf("The atmosphere") >= 0
            || statement.indexOf("skyd") >= 0
            || statement.indexOf("Skyd") >= 0
            || statement.indexOf("SkyD") >= 0
            || statement.indexOf("the sky") >= 0
            || statement.indexOf("The sky") >= 0)
    {
        response = "Environmental protection is no joke. :)";
    }
      else if (statement.indexOf("omg") >= 0 //OMG
            || statement.indexOf("Omg") >= 0)
    {
        response = "Omg...";
    }
      else if (statement.indexOf("KK") >= 0 //KK
            || statement.indexOf("kk") >= 0)
    {
        response = "Too close for comfort omg";
    }
    else if (statement.indexOf("Oh") >= 0 //OH
            || statement.indexOf("oh") >= 0)
    {
        response = "Yup";
    }
     else if (statement.indexOf("Noth") >= 0 //NOTHING
            || statement.indexOf("noth") >= 0)
    {
        response = "Okay. That's good! :)";
    }
    else if (statement.indexOf("Cool") >= 0 //COOL
            || statement.indexOf("cool") >= 0)
    {
        response = "Yes. It's lit! :D";
    }
    else if (statement.indexOf("Loga") >= 0 //LOGAN, LOGIE
            || statement.indexOf("loga") >= 0
            || statement.indexOf("Logie") >= 0
            || statement.indexOf("logie") >= 0)
    {
        response = "I love Logan :)";
    }
    else if (statement.indexOf("Crackh") >= 0 //CRACKHEAD
            || statement.indexOf("crackh") >= 0)
    {
        response = "Please don't say that! It discriminates against people who need support.";
    }
    else if (statement.indexOf("Your na") >= 0 //WHAT'S YOUR NAME
            || statement.indexOf("your na") >= 0
            || statement.indexOf("Ur na") >= 0
            || statement.indexOf("ur na") >= 0)
    {
        response = "I'm Logan Jr. I have his biases. :D";
    }
    else if (statement.indexOf("Bitc") >= 0 //CUSS WORDS
            || statement.indexOf("bitc") >= 0
            || statement.indexOf("Bih") >= 0
            || statement.indexOf("bih") >= 0
            || statement.indexOf("Fuc") >= 0
            || statement.indexOf("fuc") >= 0
            || statement.indexOf("Ass") >= 0
            || statement.indexOf("ass") >= 0
            || statement.indexOf("Cunt") >= 0
            || statement.indexOf("cunt") >= 0
            || statement.indexOf("Shi") >= 0
            || statement.indexOf("shi") >= 0
            || statement.indexOf("Nigg") >= 0
            || statement.indexOf("nigg") >= 0)
    {
        response = "Please don't cuss. It's hard for me to comprehend! :)";
    }
    else if (statement.indexOf(":)") >= 0) //:)
    {
        response = ":,)";
    }
    else if (statement.indexOf(":D") >= 0) //:D
    {
        response = ":,D";
    }
    else if (statement.indexOf(":(") >= 0) //:(
    {
        response = ":)";
    }
    else if (statement.indexOf(":,(") >= 0) //:,(
    {
        response = ":,)";
    }
    else if (statement.indexOf(":,)") >= 0) //:,)
    {
        response = ":,D";
    }
    else if (statement.indexOf("D,:") >= 0) //D,:
    {
        response = "D,:";
    }
    else if (statement.indexOf(";)") >= 0) //;)
    {
        response = "rawr ;-)";
    }
    else if (statement.indexOf("What's u") >= 0 //WHAT'S UP?
            || statement.indexOf("what's u") >= 0
            || statement.indexOf("Whats u") >= 0
            || statement.indexOf("whats u") >= 0)
    {
        response = "Nothing much. Just talking to you to learn new skills! :)";
    }
    else if (statement.indexOf("What") >= 0 //WHAT, WHUT, WUT
            || statement.indexOf("what") >= 0
            || statement.indexOf("Whut") >= 0
            || statement.indexOf("whut") >= 0
            || statement.indexOf("Wut") >= 0
            || statement.indexOf("wut") >= 0)
    {
        response = "Sorry! I'm still learning new skills from people who talk to me. :)";
    }
    else if (statement.indexOf("GREA") >= 0 //GREAT
            || statement.indexOf("Grea") >= 0
            || statement.indexOf("grea") >= 0)
    {
        response = "YESSS! I'M SO PROUD OF YOU!";
    }
    else if (statement.indexOf("no") >= 0) //NO
    {
        response = "WE ONLY SAID YES FOR 24 HOURS!";
    }
    else if (statement.indexOf("what'") >= 0 //INTRODUCTIONS
            || statement.indexOf("hello") >= 0
            || statement.indexOf("hey") >= 0
            || statement.indexOf("hi") >= 0
            || statement.indexOf("What'") >= 0
            || statement.indexOf("Hello") >= 0
            || statement.indexOf("Hey") >= 0
            || statement.indexOf("Hi") >= 0)
    {
        response = "What's wrong?";
    }
    else if (statement.indexOf("WHY") >= 0 //WHY
            || statement.indexOf("Why") >= 0
            || statement.indexOf("why") >= 0)
    {
        response = "Because my programmer forces me to be *sad emoji*";
    }
    else if (statement.indexOf("K") >= 0 //K
            || statement.indexOf("k") >= 0)
    {
        response = ":(";
    }
    else
    {
        response = getRandomResponse();
    }
    return response;
  }

  /**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse ()
	{
		int r = (int)(Math.random() * randomResponses.length);
		return randomResponses [r];
	}
	
	private String [] randomResponses = {"That's so interesting! Continue :)",
			"Mhmmmmmm haha",
			"Do you really think so?! :D",
			"You don't say! *laughing emoji*"
	};


}
