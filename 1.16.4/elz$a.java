/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
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
/*    */ {
/* 68 */   private final List<elz.b> a = Lists.newArrayList();
/*    */   
/*    */   public a a(@Nullable elo ☃, int i) {
/* 71 */     if (☃ != null) {
/* 72 */       this.a.add(new elz.b(☃, i));
/*    */     }
/* 74 */     return this;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public elo a() {
/* 79 */     if (this.a.isEmpty()) {
/* 80 */       return null;
/*    */     }
/* 82 */     if (this.a.size() == 1) {
/* 83 */       return ((elz.b)this.a.get(0)).b;
/*    */     }
/* 85 */     return new elz(this.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */