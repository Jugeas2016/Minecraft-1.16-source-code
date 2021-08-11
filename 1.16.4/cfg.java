/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Collection;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class cfg
/*    */   extends cfj<Integer>
/*    */ {
/*    */   private final ImmutableSet<Integer> a;
/*    */   
/*    */   protected cfg(String ☃, int i, int j) {
/* 14 */     super(☃, Integer.class);
/* 15 */     if (i < 0) {
/* 16 */       throw new IllegalArgumentException("Min value of " + ☃ + " must be 0 or greater");
/*    */     }
/* 18 */     if (j <= i) {
/* 19 */       throw new IllegalArgumentException("Max value of " + ☃ + " must be greater than min (" + i + ")");
/*    */     }
/*    */ 
/*    */     
/* 23 */     Set<Integer> set = Sets.newHashSet();
/* 24 */     for (int k = i; k <= j; k++) {
/* 25 */       set.add(Integer.valueOf(k));
/*    */     }
/*    */     
/* 28 */     this.a = ImmutableSet.copyOf(set);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<Integer> a() {
/* 33 */     return (Collection<Integer>)this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 38 */     if (this == ☃) {
/* 39 */       return true;
/*    */     }
/*    */     
/* 42 */     if (☃ instanceof cfg && super.equals(☃)) {
/* 43 */       cfg cfg1 = (cfg)☃;
/*    */       
/* 45 */       return this.a.equals(cfg1.a);
/*    */     } 
/*    */     
/* 48 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 53 */     return 31 * super.b() + this.a.hashCode();
/*    */   }
/*    */   
/*    */   public static cfg a(String ☃, int i, int j) {
/* 57 */     return new cfg(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<Integer> b(String ☃) {
/*    */     try {
/* 63 */       Integer integer = Integer.valueOf(☃);
/*    */       
/* 65 */       return this.a.contains(integer) ? Optional.<Integer>of(integer) : Optional.<Integer>empty();
/* 66 */     } catch (NumberFormatException numberFormatException) {
/* 67 */       return Optional.empty();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(Integer ☃) {
/* 73 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */