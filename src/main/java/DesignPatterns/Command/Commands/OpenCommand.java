package DesignPatterns.Command.Commands;

import DesignPatterns.Command.IDocument;

public class OpenCommand implements Command {

    String deletedContent;
    String openFileName;
    IDocument _document;

    public OpenCommand(String openFileName, IDocument _document) {
        this.openFileName = openFileName;
        this._document = _document;
    }

    @Override
    public void execute() {
        deletedContent = _document.sequence().toString();
        _document.open(openFileName);
    }

    @Override
    public void undo() {
        _document.clear();
        _document.insert(0 , deletedContent);
    }
}
