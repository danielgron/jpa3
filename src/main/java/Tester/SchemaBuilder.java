/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;
import javax.persistence.Persistence;
/**
 *
 * @author danie
 */
public class SchemaBuilder {
    public static void main(String[] args) {
        Persistence.generateSchema("PU", null);
    }
}