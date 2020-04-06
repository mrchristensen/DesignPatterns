package DesignPatterns.Command;

import DesignPatterns.Command.Commands.Command;

import java.util.Stack;

public class UndoRedoManager {  //The invoker
    Stack<Command> undoCommandStack = new Stack<>();
    Stack<Command> redoCommandStack = new Stack<>();

    void execute(Command command){
        command.execute();
        undoCommandStack.push(command);
        redoCommandStack.clear();
    }

    void undo(){
        Command command = undoCommandStack.pop();
        command.undo();
        redoCommandStack.push(command);
    }

    void redo(){
        Command command = redoCommandStack.pop();
        command.execute();
        undoCommandStack.push(command);
    }

    boolean canUndo(){
        if(!undoCommandStack.empty()){
            return true;
        }
        return false;
    }

    boolean canRedo(){
        if(!redoCommandStack.empty()){
            return true;
        }
        return false;
    }
}
