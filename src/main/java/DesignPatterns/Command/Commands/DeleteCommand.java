package DesignPatterns.Command.Commands;

import DesignPatterns.Command.IDocument;

public class DeleteCommand implements Command {
    int deletionIndex;
    int deletionDistance;
    String deletedContent;
    IDocument _document;

    public DeleteCommand(int deletionIndex, int deletionDistance, IDocument _document) {
        this.deletionIndex = deletionIndex;
        this.deletionDistance = deletionDistance;
        this._document = _document;
    }

    @Override
    public void execute() {
        deletedContent = _document.sequence().toString().substring(deletionIndex, deletionIndex + deletionDistance);
        _document.delete(deletionIndex, deletionDistance);
    }

    @Override
    public void undo() {
        _document.insert(deletionIndex, deletedContent);
    }
}
