/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.Collection;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ public class cey
/*    */   extends cfj<Boolean>
/*    */ {
/*    */   private final ImmutableSet<Boolean> a;
/*    */   
/*    */   protected cey(String ☃) {
/* 12 */     super(☃, Boolean.class);
/* 13 */     this.a = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<Boolean> a() {
/* 18 */     return (Collection<Boolean>)this.a;
/*    */   }
/*    */   
/*    */   public static cey a(String ☃) {
/* 22 */     return new cey(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<Boolean> b(String ☃) {
/* 27 */     if ("true".equals(☃) || "false".equals(☃)) {
/* 28 */       return Optional.of(Boolean.valueOf(☃));
/*    */     }
/*    */     
/* 31 */     return Optional.empty();
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(Boolean ☃) {
/* 36 */     return ☃.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 41 */     if (this == ☃) {
/* 42 */       return true;
/*    */     }
/*    */     
/* 45 */     if (☃ instanceof cey && super.equals(☃)) {
/* 46 */       cey cey1 = (cey)☃;
/*    */       
/* 48 */       return this.a.equals(cey1.a);
/*    */     } 
/*    */     
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 56 */     return 31 * super.b() + this.a.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */