/*    */ import java.util.Collection;
/*    */ 
/*    */ public class eka
/*    */   extends RuntimeException
/*    */ {
/*    */   private final Collection<ekc.a> a;
/*    */   
/*    */   public eka(ekc.a ☃, Collection<ekc.a> collection) {
/*  9 */     super(String.format("Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", new Object[] { ☃
/*    */             
/* 11 */             .a(), 
/* 12 */             Integer.valueOf(☃.b()), 
/* 13 */             Integer.valueOf(☃.c()) }));
/*    */ 
/*    */     
/* 16 */     this.a = collection;
/*    */   }
/*    */   
/*    */   public Collection<ekc.a> a() {
/* 20 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */