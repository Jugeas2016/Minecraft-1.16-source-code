/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.StringUtils;
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
/*    */   @Nullable
/*    */   private String a;
/* 55 */   private final List<String> b = Lists.newArrayList();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void a(String ☃) {
/* 61 */     this.b.add(0, ☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String b() {
/* 70 */     return StringUtils.join(this.b, "->");
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     if (this.a != null) {
/* 76 */       if (this.b.isEmpty()) {
/* 77 */         return this.a;
/*    */       }
/* 79 */       return this.a + " " + b();
/*    */     } 
/*    */     
/* 82 */     if (this.b.isEmpty()) {
/* 83 */       return "(Unknown file)";
/*    */     }
/* 85 */     return "(Unknown file) " + b();
/*    */   }
/*    */   
/*    */   private a() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */