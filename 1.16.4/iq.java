/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class iq
/*    */ {
/* 11 */   private static final iq a = new iq((List<cfj.a<?>>)ImmutableList.of()); private static final Comparator<cfj.a<?>> b; static {
/* 12 */     b = Comparator.comparing(☃ -> ☃.a().f());
/*    */   }
/*    */   private final List<cfj.a<?>> c;
/*    */   
/*    */   public iq a(cfj.a<?> ☃) {
/* 17 */     return new iq((List<cfj.a<?>>)ImmutableList.builder().addAll(this.c).add(☃).build());
/*    */   }
/*    */   
/*    */   public iq a(iq ☃) {
/* 21 */     return new iq((List<cfj.a<?>>)ImmutableList.builder().addAll(this.c).addAll(☃.c).build());
/*    */   }
/*    */   
/*    */   private iq(List<cfj.a<?>> ☃) {
/* 25 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public static iq a() {
/* 29 */     return a;
/*    */   }
/*    */   
/*    */   public static iq a(cfj.a<?>... ☃) {
/* 33 */     return new iq((List<cfj.a<?>>)ImmutableList.copyOf((Object[])☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 38 */     return (this == ☃ || (☃ instanceof iq && this.c.equals(((iq)☃).c)));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 43 */     return this.c.hashCode();
/*    */   }
/*    */   
/*    */   public String b() {
/* 47 */     return this.c.stream().sorted(b).map(cfj.a::toString).collect(Collectors.joining(","));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 52 */     return b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\iq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */