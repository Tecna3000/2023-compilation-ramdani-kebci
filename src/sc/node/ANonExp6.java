/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ANonExp6 extends PExp6
{
    private TNon _non_;
    private PExp6 _exp6_;

    public ANonExp6()
    {
        // Constructor
    }

    public ANonExp6(
        @SuppressWarnings("hiding") TNon _non_,
        @SuppressWarnings("hiding") PExp6 _exp6_)
    {
        // Constructor
        setNon(_non_);

        setExp6(_exp6_);

    }

    @Override
    public Object clone()
    {
        return new ANonExp6(
            cloneNode(this._non_),
            cloneNode(this._exp6_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANonExp6(this);
    }

    public TNon getNon()
    {
        return this._non_;
    }

    public void setNon(TNon node)
    {
        if(this._non_ != null)
        {
            this._non_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._non_ = node;
    }

    public PExp6 getExp6()
    {
        return this._exp6_;
    }

    public void setExp6(PExp6 node)
    {
        if(this._exp6_ != null)
        {
            this._exp6_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp6_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._non_)
            + toString(this._exp6_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._non_ == child)
        {
            this._non_ = null;
            return;
        }

        if(this._exp6_ == child)
        {
            this._exp6_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._non_ == oldChild)
        {
            setNon((TNon) newChild);
            return;
        }

        if(this._exp6_ == oldChild)
        {
            setExp6((PExp6) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
