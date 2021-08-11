/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vn
/*    */   extends IOException
/*    */ {
/* 12 */   private final List<a> a = Lists.newArrayList();
/*    */   private final String b;
/*    */   
/*    */   public vn(String ☃) {
/* 16 */     this.a.add(new a());
/* 17 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public vn(String ☃, Throwable throwable) {
/* 21 */     super(throwable);
/* 22 */     this.a.add(new a());
/* 23 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public void a(String ☃) {
/* 27 */     a.a(this.a.get(0), ☃);
/*    */   }
/*    */   
/*    */   public void b(String ☃) {
/* 31 */     a.b(this.a.get(0), ☃);
/* 32 */     this.a.add(0, new a());
/*    */   }
/*    */ 
/*    */   
/*    */   public String getMessage() {
/* 37 */     return "Invalid " + this.a.get(this.a.size() - 1) + ": " + this.b;
/*    */   }
/*    */   
/*    */   public static vn a(Exception ☃) {
/* 41 */     if (☃ instanceof vn) {
/* 42 */       return (vn)☃;
/*    */     }
/* 44 */     String str = ☃.getMessage();
/* 45 */     if (☃ instanceof java.io.FileNotFoundException) {
/* 46 */       str = "File not found";
/*    */     }
/* 48 */     return new vn(str, ☃);
/*    */   }
/*    */   
/*    */   public static class a
/*    */   {
/*    */     @Nullable
/*    */     private String a;
/* 55 */     private final List<String> b = Lists.newArrayList();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     private void a(String ☃) {
/* 61 */       this.b.add(0, ☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public String b() {
/* 70 */       return StringUtils.join(this.b, "->");
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 75 */       if (this.a != null) {
/* 76 */         if (this.b.isEmpty()) {
/* 77 */           return this.a;
/*    */         }
/* 79 */         return this.a + " " + b();
/*    */       } 
/*    */       
/* 82 */       if (this.b.isEmpty()) {
/* 83 */         return "(Unknown file)";
/*    */       }
/* 85 */       return "(Unknown file) " + b();
/*    */     }
/*    */     
/*    */     private a() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */