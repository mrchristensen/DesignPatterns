/**
 * The Document class is used to store and modify the contents of a 
 * text document.
 * 
 * Operations are provided for reading, inserting, and deleting characters
 * in the document.
 * For convenience, cursor-relative operations are provided to make it easier
 * to edit a document in the style supported by a typical text editor.
 *
 * Domain:
 *      Content: Sequence<char>, Document content
 *      Length: Integer, Number of characters in the document (initially zero)
 *      Cursor: Integer, Position in the character sequence where some
 *              operations on the document occur (initially zero)
 *
 * @invariant length() >= 0
 * @invariant 0 <= cursor() <= length()
 */
class Document {

	/**
	 * Initializes empty document
	 * 
	 * @pre None
	 * 
	 * @post new length() = 0
	 * @post new cursor() = 0
	 */
	Document(){}

    
	/**
	 * Returns the number of characters in the document
	 * 
	 * @pre None
	 * 
	 * @post Return value contains the number of characters in the document
	 */
	int length() { return 0; }

    
	/**
	 * Returns the specified number of characters, starting at the specified
	 * position
	 * 
	 * @param pos Position of the characters to be returned
	 * @param count Number of characters to be returned
	 *
     * @pre 0 <= pos <= length()
     * @pre count > 0
	 * @pre count + pos <= length()
     *
	 * @post The return string.length() == count
     * @post The return string equals the substring of the document from pos to pos + count
	 */
	String read(int pos, int count) { return null; }
	
    
	/**
	 * Inserts a character sequence into the document
	 * 
	 * @param pos Position at which the character sequence should be inserted
	 * @param s Character sequence to be inserted
	 *
     * @pre 0 <= pos <= length()
     * @pre s.length() > 0
	 * @pre s != null
	 * 
	 * @post The old document length + s.length() = new document length
	 * @post A read after an insert will be the old document with the inserted string s at position pos
	 */
	void insert(int pos, String s) {}

	
	/**
	 * Deletes a character sequence from the document.
	 * 
	 * @param pos Starting position of the sequence that is being deleted 
	 * @param count Number of characters to be deleted
	 *
     * @pre pos + count <= length()
     * @pre pos >= 0
     * @pre count > 0
	 * 
	 * @post The new document length = old document length - count
     * @post A read after an delete will be the old document minus the inserted chars at position pos with length count

     */
	void delete(int pos, int count) {}

    
	/**
	 * Returns the current cursor position
	 * 
	 * @pre None
	 * 
	 * @post Return value contains the current cursor position
	 */
	int cursor() { return 0; }
	
    
	/**
	 * Sets the current cursor position
	 * 
	 * @param pos New cursor position
	 * 
	 * @pre 0 <= pos <= length()
	 * 
	 * @post new cursor() = pos
	 */
	void setCursor(int pos) {}

    
	/**
	 * Inserts a single character into the document at the current cursor
     * position, and advances the cursor forward one position
	 * 
	 * @param c Character to be inserted
	 *
     * @pre c != null
	 * 
	 * @post new cursor pos = old cursor + 1
	 * @post read would show the addition of the char c where the cursor was
	 */
	void insert(char c) {}
	
    
	/**
	 * Deletes the character at the current cursor position
	 * 
	 * @pre length() > 0
     *
     * @post new length() = old length() - 1
     * @post read would show the old document without the character at the cursor's position
	 */
	void delete() {}


	/**
	 * Moves the cursor backward one position, and deletes the character at the new cursor position
	 *
     * @pre length() > 0
     * @pre cursor() != 0
     * @pre cursor() > length()
     *
     * @post new length() = old length() - 1
     * @post read would show the old document without the character at the cursor's previous position
     */
	void deletePrevious() {}

    
	/**
	 * Deletes the entire contents of the document and resets it to an empty state
	 *
	 * @pre none
	 * 
	 * @post length() == 0
     * @post A read would show an empty document
     * @post cursor() == 0
	 */
	void clear() {}
}
