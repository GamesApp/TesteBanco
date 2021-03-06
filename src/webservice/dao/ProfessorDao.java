/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.util.ArrayList;
import org.bson.types.ObjectId;
import webservice.entidades.pessoa.Professor;

/**
 *
 * @author matheush
 */
public class ProfessorDao {
    private Mongo mongo;
    private DB db;
    private DBCollection dBCollection;

    public ProfessorDao() {
        this.mongo = new Mongo("localhost" , 27017);
        this.db = mongo.getDB("GamesApp");
        this.dBCollection = db.getCollection("Professor");
    }
    
    public void insert(Professor professor) {
        BasicDBObject basicProfessor = new BasicDBObject();
        
        basicProfessor.put("nome", professor.getNome());
        basicProfessor.put("email", professor.getEmail());
        basicProfessor.put("siape", professor.getSiape());
        basicProfessor.put("senha", professor.getSenha());
        
        dBCollection.insert(basicProfessor);
    }
    
    public ArrayList<Professor> findAll() {
        ArrayList<Professor> professores = new ArrayList<>();
        
        DBCursor cursor = dBCollection.find();
        while(cursor.hasNext()) {
            Professor professor = new Professor();
            
            BasicDBObject basicProfessor = (BasicDBObject) cursor.next();
            professor.setId(basicProfessor.getString("_id"));
            professor.setNome(basicProfessor.getString("nome"));
            professor.setEmail(basicProfessor.getString("email"));
            professor.setSenha(basicProfessor.getString("senha"));
            professor.setSiape(basicProfessor.getString("siape"));
            
            professores.add(professor);
        }
        
        return professores;        
    }
    
    public void update(String id, Professor professor) {
        BasicDBObject basicAlterar = new BasicDBObject();
        basicAlterar.put("_id", new ObjectId(id));
        
        BasicDBObject basicAlteracoes = new BasicDBObject();
        basicAlteracoes.put("nome", professor.getNome());
        basicAlteracoes.put("email", professor.getEmail());
        basicAlteracoes.put("matricula", professor.getSiape());
        basicAlteracoes.put("senha", professor.getSenha());
        
        dBCollection.update(basicAlterar, basicAlteracoes);
    }
}
