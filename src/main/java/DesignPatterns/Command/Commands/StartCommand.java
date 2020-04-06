package DesignPatterns.Command.Commands;

import DesignPatterns.Command.IDocument;

public class StartCommand implements Command {

    String deletedContent;
    IDocument _document;

    public StartCommand(IDocument _document) {
        this._document = _document;
    }

    @Override
    public void execute() {
        deletedContent = _document.sequence().toString();
        _document.clear();
    }

    @Override
    public void undo() {
        _document.insert(0 , deletedContent);
    }
}
