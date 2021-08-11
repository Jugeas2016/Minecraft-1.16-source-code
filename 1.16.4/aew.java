/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
/*    */ import java.io.Writer;
/*    */ import java.util.List;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.Stream;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.StringEscapeUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aew
/*    */ {
/*    */   private final Writer a;
/*    */   private final int b;
/*    */   
/*    */   private aew(Writer ☃, List<String> list) throws IOException {
/* 20 */     this.a = ☃;
/* 21 */     this.b = list.size();
/* 22 */     a(list.stream());
/*    */   }
/*    */   
/*    */   public static a a() {
/* 26 */     return new a();
/*    */   }
/*    */   
/*    */   public void a(Object... ☃) throws IOException {
/* 30 */     if (☃.length != this.b) {
/* 31 */       throw new IllegalArgumentException("Invalid number of columns, expected " + this.b + ", but got " + ☃.length);
/*    */     }
/*    */     
/* 34 */     a(Stream.of(☃));
/*    */   }
/*    */   
/*    */   private void a(Stream<?> ☃) throws IOException {
/* 38 */     this.a.write((String)☃.<CharSequence>map(aew::a).collect(Collectors.joining(",")) + "\r\n");
/*    */   }
/*    */   
/*    */   private static String a(@Nullable Object ☃) {
/* 42 */     return StringEscapeUtils.escapeCsv((☃ != null) ? ☃.toString() : "[null]");
/*    */   }
/*    */   
/*    */   public static class a {
/* 46 */     private final List<String> a = Lists.newArrayList();
/*    */     
/*    */     public a a(String ☃) {
/* 49 */       this.a.add(☃);
/* 50 */       return this;
/*    */     }
/*    */     
/*    */     public aew a(Writer ☃) throws IOException {
/* 54 */       return new aew(☃, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */