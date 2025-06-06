import java.util.Set;

public class ProblemSolving {

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   */
  public static boolean allStartWithA(Set<String> words) 
  {
    if(words.isEmpty())
    {
      return true;
    }
    
    for(String word : words)
    {
      if(!word.toLowerCase().startsWith("a"))
      {
        return false;
      }
    }

    return true;
  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) 
  {
    if(words.isEmpty())
    {
      return false;
    }
    
    for(String word : words)
    {
      if(word !=null && word.isEmpty())
      {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns the length of the longest word in the set.
   * 
   * Edge case: If the set is empty, return 0
   * 
   * @param words a set of words
   * @return the maximum length of a word in the set
   */
  public static int maxLength(Set<String> words) 
  {
    if(words.isEmpty())
    {
      return 0;
    }

    String longest = "";
  
    for(String word : words)
    {
      if(word != null && word.trim().length() > longest.length())
      {
        longest = word;
      }
    }

    return longest.length();
  }

 /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */
  public static int minLength(Set<String> words) 
  {
      if(words.isEmpty())
      {
        return Integer.MAX_VALUE;
      }
  
      int shortest = Integer.MAX_VALUE;
    
      for(String word : words)
      {
        if(word !=null)
        {
          word = word.trim();
          
          if(!word.isEmpty() && word.length() < shortest)
          {
            shortest = word.length();
          }

        }
    
      }

      return shortest;
    }
  
}