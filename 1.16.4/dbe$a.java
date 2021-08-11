/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements dbo.a
/*    */ {
/* 44 */   private final List<dbo> a = Lists.newArrayList();
/*    */   
/*    */   public a(dbo.a... ☃) {
/* 47 */     for (dbo.a a1 : ☃) {
/* 48 */       this.a.add(a1.build());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(dbo.a ☃) {
/* 54 */     this.a.add(☃.build());
/* 55 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbo build() {
/* 60 */     return new dbe(this.a.<dbo>toArray(new dbo[0]), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbe$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */