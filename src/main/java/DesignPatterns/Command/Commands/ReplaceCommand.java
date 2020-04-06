package DesignPatterns.Command.Commands;

import DesignPatterns.Command.IDocument;

public class ReplaceCommand implements Command {
    int replaceIndex;
    int replaceDistance;
    String replacementString;
    String deletedContent;
    IDocument _document;

    public ReplaceCommand(int replaceIndex, int replaceDistance, String replacementString, IDocument _document) {
        this.replaceIndex = replaceIndex;
        this.replaceDistance = replaceDistance;
        this.replacementString = replacementString;
        this._document = _document;
    }

    @Override
    public void execute() {
        deletedContent = _document.sequence().toString().substring(replaceIndex, replaceIndex + replaceDistance);

        _document.delete(replaceIndex, replaceDistance);
        _document.insert(replaceIndex, replacementString);
    }

    @Override
    public void undo() {
        _document.delete(replaceIndex, replacementString.length());
        _document.insert(replaceIndex, deletedContent);
    }
}
