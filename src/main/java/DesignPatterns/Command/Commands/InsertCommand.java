package DesignPatterns.Command.Commands;

import DesignPatterns.Command.IDocument;

public class InsertCommand implements Command {
    int insertionIndex;
    String sequenceInput;
    IDocument _document;

    public InsertCommand(int insertionIndex, String sequenceInput, IDocument _document) {
        this.insertionIndex = insertionIndex;
        this.sequenceInput = sequenceInput;
        this._document = _document;
    }

    @Override
    public void execute() {
        _document.insert(insertionIndex, sequenceInput);
    }

    @Override
    public void undo() {
        _document.delete(insertionIndex, sequenceInput.length());
    }
}
