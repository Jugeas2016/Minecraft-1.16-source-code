/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class oa
/*    */   extends nn
/*    */   implements nt
/*    */ {
/* 15 */   private static final Logger d = LogManager.getLogger();
/*    */   
/*    */   private final String e;
/*    */   @Nullable
/*    */   private final fc f;
/*    */   
/*    */   public oa(String ☃) {
/* 22 */     this.e = ☃;
/*    */     
/* 24 */     fc fc1 = null;
/*    */     try {
/* 26 */       fd fd = new fd(new StringReader(☃));
/* 27 */       fc1 = fd.t();
/* 28 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 29 */       d.warn("Invalid selector component: {}", ☃, commandSyntaxException.getMessage());
/*    */     } 
/* 31 */     this.f = fc1;
/*    */   }
/*    */   
/*    */   public String h() {
/* 35 */     return this.e;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public nx a(@Nullable db ☃, @Nullable aqa aqa1, int i) throws CommandSyntaxException {
/* 45 */     if (☃ == null || this.f == null) {
/* 46 */       return new oe("");
/*    */     }
/* 48 */     return fc.a(this.f.b(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String a() {
/* 54 */     return this.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public oa j() {
/* 59 */     return new oa(this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 64 */     if (this == ☃) {
/* 65 */       return true;
/*    */     }
/*    */     
/* 68 */     if (☃ instanceof oa) {
/* 69 */       oa oa1 = (oa)☃;
/* 70 */       return (this.e.equals(oa1.e) && super.equals(☃));
/*    */     } 
/*    */     
/* 73 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 78 */     return "SelectorComponent{pattern='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*    */ 
/*    */       
/* 81 */       c() + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\oa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */