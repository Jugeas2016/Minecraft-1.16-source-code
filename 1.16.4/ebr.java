/*    */ import com.google.common.base.MoreObjects;
/*    */ import com.google.common.base.Splitter;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ebr
/*    */   implements ebq
/*    */ {
/* 16 */   private static final Splitter c = Splitter.on('|').omitEmptyStrings();
/*    */   
/*    */   private final String d;
/*    */   private final String e;
/*    */   
/*    */   public ebr(String ☃, String str1) {
/* 22 */     this.d = ☃;
/* 23 */     this.e = str1;
/*    */   }
/*    */   
/*    */   public Predicate<ceh> getPredicate(cei<buo, ceh> ☃) {
/*    */     Predicate<ceh> predicate;
/* 28 */     cfj<?> cfj = ☃.a(this.d);
/* 29 */     if (cfj == null) {
/* 30 */       throw new RuntimeException(String.format("Unknown property '%s' on '%s'", new Object[] { this.d, ((buo)☃.c()).toString() }));
/*    */     }
/*    */     
/* 33 */     String str = this.e;
/* 34 */     boolean bool = (!str.isEmpty() && str.charAt(0) == '!');
/* 35 */     if (bool) {
/* 36 */       str = str.substring(1);
/*    */     }
/*    */     
/* 39 */     List<String> list = c.splitToList(str);
/* 40 */     if (list.isEmpty()) {
/* 41 */       throw new RuntimeException(String.format("Empty value '%s' for property '%s' on '%s'", new Object[] { this.e, this.d, ((buo)☃.c()).toString() }));
/*    */     }
/*    */ 
/*    */     
/* 45 */     if (list.size() == 1) {
/* 46 */       predicate = a(☃, cfj, str);
/*    */     } else {
/* 48 */       List<Predicate<ceh>> list1 = (List<Predicate<ceh>>)list.stream().map(str -> a(☃, cfj1, str)).collect(Collectors.toList());
/* 49 */       predicate = (ceh1 -> ☃.stream().anyMatch(()));
/*    */     } 
/*    */     
/* 52 */     return bool ? predicate.negate() : predicate;
/*    */   }
/*    */   
/*    */   private Predicate<ceh> a(cei<buo, ceh> ☃, cfj<?> cfj1, String str) {
/* 56 */     Optional<?> optional = cfj1.b(str);
/* 57 */     if (!optional.isPresent()) {
/* 58 */       throw new RuntimeException(String.format("Unknown value '%s' for property '%s' on '%s' in '%s'", new Object[] { str, this.d, ((buo)☃.c()).toString(), this.e }));
/*    */     }
/*    */     
/* 61 */     return ceh1 -> ceh1.c(☃).equals(optional.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 66 */     return MoreObjects.toStringHelper(this)
/* 67 */       .add("key", this.d)
/* 68 */       .add("value", this.e)
/* 69 */       .toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */