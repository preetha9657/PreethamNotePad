package com.example.notepadpractice.service.repository;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.notepadpractice.service.model.Note;
import com.example.notepadpractice.util.Constants;

import java.util.List;

/**
 * Created by Preetham S on 09/02/19.
 */

@Dao
public interface NoteDao {

    @Query("SELECT * FROM "+ Constants.TABLE_NAME_NOTE)
    List<Note> getNotes();

    /*
    * Insert the object in database
    * @param note, object to be inserted
    */
    @Insert
    long insertNote(Note note);

    /*
    * update the object in database
    * @param note, object to be updated
    */
    @Update
    void updateNote(Note repos);

    /*
    * delete the object from database
    * @param note, object to be deleted
    */
    @Delete
    void deleteNote(Note note);

    // Note... is varargs, here note is an array
    /*
    * delete list of objects from database
    * @param note, array of oject to be deleted
    */
    @Delete
    void deleteNotes(Note... note);

}
